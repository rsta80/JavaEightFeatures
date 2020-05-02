package org.rsta80.solidprinciples.lsp;

import org.rsta80.solidprinciples.lsp.interfaces.GrassCourt;

import java.util.LinkedList;
import java.util.List;

public class LiskSustPrMain {

    public static void main(String ... args){

        testGrassCourt();
    }

    /*public static void testCourt(){
        List<Court> courts = new LinkedList<>();
        courts.add(new WimbledonCourt());
        courts.add(new AustraliaOpenCourt());
        courts.add(new RolandGarrosCourt());

        courts.stream().forEach(Court::cutGrass);

    }*/

    public static void testGrassCourt(){
        List<GrassCourt> courts = new LinkedList<>();
        courts.add(new WimbledonCourt());
        /*It can't call AustraliaCourt because it is not a Grass court
        courts.add(new AustraliaOpenCourt());*/

        courts.stream().forEach(GrassCourt::cutGrass);

    }

}

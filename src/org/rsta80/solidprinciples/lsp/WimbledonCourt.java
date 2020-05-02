package org.rsta80.solidprinciples.lsp;

import org.rsta80.solidprinciples.lsp.interfaces.GrassCourt;

public class WimbledonCourt extends Court implements GrassCourt {

    @Override
    public void cutGrass() {
        System.out.println("Cutting Wimbledon grass");
    }
}

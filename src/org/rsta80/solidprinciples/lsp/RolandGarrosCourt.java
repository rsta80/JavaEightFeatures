package org.rsta80.solidprinciples.lsp;

import org.rsta80.solidprinciples.lsp.interfaces.ClayCourt;

public class RolandGarrosCourt extends Court implements ClayCourt {

    @Override
    public void changeClay() {

        System.out.println("Changing clay");

    }
}

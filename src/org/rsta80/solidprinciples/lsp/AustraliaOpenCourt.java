package org.rsta80.solidprinciples.lsp;

import org.rsta80.solidprinciples.lsp.interfaces.HardCourt;

public class AustraliaOpenCourt extends Court implements HardCourt {

    @Override
    public void cleanHardCourt() {
        System.out.println("Cleaning hard court");
    }
}

package com.boydti.fawe.bukkit.v0;

public class ChunkListener_8 extends ChunkListener {

    @Override
    protected int getDepth(Exception ex) {
        // Use the standard API to get the depth of the stack trace
        return ex.getStackTrace().length;
    }

    @Override
    protected StackTraceElement getElement(Exception ex, int index) {
        // Use the standard API to retrieve the specific stack trace element
        return ex.getStackTrace()[index];
    }
}
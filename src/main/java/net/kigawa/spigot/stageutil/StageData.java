package net.kigawa.spigot.stageutil;

import net.kigawa.spigot.pluginutil.recorder.RecorderData;

public class StageData extends RecorderData {

    int[] startLoc = new int[3];
    double[] stageLoc = new double[6];
    String stageWorld;

    public int[] getStartLoc() {
        return startLoc;
    }

    public void setStartLoc(int[] startLoc) {
        this.startLoc = startLoc;
    }

    public double[] getStageLoc() {
        return stageLoc;
    }

    public void setStageLoc(double[] stageLoc) {
        this.stageLoc = stageLoc;
    }

    public String getStageWorld() {
        return stageWorld;
    }

    public void setStageWorld(String stageWorld) {
        this.stageWorld = stageWorld;
    }
}

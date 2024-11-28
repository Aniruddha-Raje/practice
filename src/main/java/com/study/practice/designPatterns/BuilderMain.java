package com.study.practice.designPatterns;

import lombok.extern.slf4j.Slf4j;

class GamingComputer {
    // Required parameters
    private final String CPU;
    private final String GPU;
    private final int RAM;

    // Optional parameters
    private final int storage;
    private final boolean liquidCooling;
    private final boolean RGBLighting;

    private GamingComputer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.liquidCooling = builder.liquidCooling;
        this.RGBLighting = builder.RGBLighting;
    }

    @Override
    public String toString() {
        return "GamingComputer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", liquidCooling=" + liquidCooling +
                ", RGBLighting=" + RGBLighting +
                '}';
    }

    public static class Builder {
        // Required parameters
        private final String CPU;
        private final String GPU;
        private final int RAM;

        // Optional parameters with default values
        private int storage = 512;
        private boolean liquidCooling = false;
        private boolean RGBLighting = false;

        public Builder(String CPU, String GPU, int RAM) {
            this.CPU = CPU;
            this.GPU = GPU;
            this.RAM = RAM;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder liquidCooling(boolean liquidCooling) {
            this.liquidCooling = liquidCooling;
            return this;
        }

        public Builder RGBLighting(boolean RGBLighting) {
            this.RGBLighting = RGBLighting;
            return this;
        }

        public GamingComputer build() {
            return new GamingComputer(this);
        }
    }
}


@Slf4j
public class BuilderMain {
    public static void main(String[] args) {
        GamingComputer myGamingComputer = new GamingComputer.Builder("Intel i9", "NVIDIA RTX 3080", 32)
                .storage(1024)
                .liquidCooling(true)
                .RGBLighting(true)
                .build();

        System.out.println(myGamingComputer);
    }
}


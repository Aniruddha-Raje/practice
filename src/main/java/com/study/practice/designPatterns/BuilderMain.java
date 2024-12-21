package com.study.practice.designPatterns;

import lombok.extern.slf4j.Slf4j;

class GamingComputer {

    private final String CPU;
    private final String GPU;
    private final int RAM;
    private final int storage;

    private GamingComputer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    @Override
    public String toString() {
        return "GamingComputer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                '}';
    }

    public static class Builder {
        // Required parameters
        private String CPU;
        private String GPU;
        private int RAM;
        private int storage = 512;

        public Builder cpu(String CPU) {
            this.CPU = GPU;
            return this;
        }

        public Builder gpu(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder ram(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
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
        GamingComputer myGamingComputer = new GamingComputer.Builder()
                .cpu("Intel i9")
                .gpu("Nvdia X Force")
                .ram(32)
                .storage(1024)
                .build();

        log.info(String.valueOf(myGamingComputer));
    }
}


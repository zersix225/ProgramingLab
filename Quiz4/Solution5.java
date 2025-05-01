package Quiz4;

public class Solution5 {
    public static void main(String[] args) {
        // DO NOT MODIFY Main class and main function
        M1Pro m1Pro = new M1Pro(8, 14, 16);
        M1Max m1Max = new M1Max(10, 24, 16);

        MacBookPro mbp1 = new MacBookPro(m1Pro);
        MacBookPro mbp2 = new MacBookPro(m1Max);
        System.out.println("-----------MacBook Pro 1-----------");
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");
        System.out.println("MBP1, CPU: " + mbp1.getSilicon().getCPUCore() + " Cores");
        System.out.println("MBP1, GPU: " + mbp1.getSilicon().getGPUCore() + " Cores");
        System.out.println("MBP1, NeuralEngine: " + mbp1.getSilicon().getNeuralEngineCore() + " Cores");
        System.out.println("MBP1, MaxMemory: " + mbp1.getSilicon().getMaximumMemorySupportedInGB() + " GB");
        mbp1.modifyMemory(32);
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");
        mbp1.modifyMemory(64);
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");

        System.out.println("-----------MacBook Pro 2-----------");
        System.out.println("MBP2, Memory: " + mbp2.getMemory().getMemoryInGB() + " GB");
        System.out.println("MBP2, CPU: " + mbp2.getSilicon().getCPUCore() + " Cores");
        System.out.println("MBP2, GPU: " + mbp2.getSilicon().getGPUCore() + " Cores");
        System.out.println("MBP2, NeuralEngine: " + mbp2.getSilicon().getNeuralEngineCore() + " Cores");
        System.out.println("MBP2, MaxMemory: " + mbp2.getSilicon().getMaximumMemorySupportedInGB() + " GB");
        mbp2.modifyMemory(64);
        System.out.println("MBP2, Memory: " + mbp2.getMemory().getMemoryInGB() + " GB");
    }

    static abstract class AppleSilicon {
        int maximumMemorySupportedInGB;
        int neuralEngineCore;
        int GPUCore;
        int CPUCore;

        public AppleSilicon(int cpuCroe, int gpuCore, int neuralEngineCore, int maximumMemorySupportedInGB) {}

        public int getCPUCore() {
            return CPUCore;
        }

        public int getGPUCore() {
            return GPUCore;
        }

        public int getNeuralEngineCore() {
            return neuralEngineCore;
        }

        public int getMaximumMemorySupportedInGB() {
            return maximumMemorySupportedInGB;
        }

    }

    static class M1Pro extends AppleSilicon {
        public  M1Pro (int CPUCroe, int GPUCore, int neuralEngineCore) {
            super(CPUCroe, GPUCore, neuralEngineCore, 32);
        }

    }

    static class M1Max extends AppleSilicon {
        public M1Max (int CPUCroe, int GPUCore, int neuralEngineCore) {
            super(CPUCroe, GPUCore, neuralEngineCore, 64);
        }
    }

    static class Memory {
        int memoryInGB;

        public Memory (int memoryInGB) {
            this.memoryInGB = memoryInGB;
        }

        public int getMemoryInGB() {
            return memoryInGB;
        }
    }

    static class MacBookPro {
        Memory memory;
        AppleSilicon silicon;

        public MacBookPro (AppleSilicon silicon) {
            this.silicon = silicon;
            memory = new Memory(16);
        }

        public void modifyMemory(int modifiedMemoryInGB) {
            if (modifiedMemoryInGB > silicon.maximumMemorySupportedInGB) {
                System.out.println("ERROR");
            } else {
                memory = new Memory(modifiedMemoryInGB);
            }
        }

        public AppleSilicon getSilicon() {
            return  silicon;
        }

        public Memory getMemory() {
            return memory;
        }
    }
}

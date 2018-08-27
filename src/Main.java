public class Main {

    private Memory memory;
    private Processor processor;
    private Harddisk harddisk;

    public static void main(String[] args) {
        Main main = new Main();

        main.createMachine(FactoryMaker.makeFactory(FactoryMaker.MachineType.COMPUTER));

        System.out.println(main.getMemory().getDescription());
        System.out.println(main.getHarddisk().getDescription());
        System.out.println(main.getProcessor().getDescription());

        main.createMachine(FactoryMaker.makeFactory(FactoryMaker.MachineType.XBOX));

        System.out.println(main.getMemory().getDescription());
        System.out.println(main.getHarddisk().getDescription());
        System.out.println(main.getProcessor().getDescription());
    }

    private void createMachine(final MachineFactory factory){
        setMemory(factory.createMemory());
        setProcessor(factory.createProcessor());
        setHarddisk(factory.createHardDisk());
    }

    public static class FactoryMaker{
        public enum MachineType {
            XBOX, COMPUTER
        }

        static MachineFactory makeFactory(MachineType machineType){
            switch (machineType){
                case XBOX :
                    return new XboxMachineFactory();
                case COMPUTER :
                    return new ComputerMachineFactory();
                default :
                    throw new IllegalArgumentException("Machine Type Not Supported");
            }
        }
    }


    private Memory getMemory() {
        return memory;
    }

    private void setMemory(Memory memory) {
        this.memory = memory;
    }

    private Processor getProcessor() {
        return processor;
    }

    private void setProcessor(Processor processor) {
        this.processor = processor;
    }

    private Harddisk getHarddisk() {
        return harddisk;
    }

    private void setHarddisk(Harddisk harddisk) {
        this.harddisk = harddisk;
    }
}

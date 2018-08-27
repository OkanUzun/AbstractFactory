public class ComputerMachineFactory implements MachineFactory {
    @Override
    public Memory createMemory() {
        return new ComputerMemory();
    }

    @Override
    public Processor createProcessor() {
        return new ComputerProcessor();
    }

    @Override
    public Harddisk createHardDisk() {
        return new ComputerHarddisk();
    }
}

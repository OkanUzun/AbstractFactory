public class XboxMachineFactory implements MachineFactory {
    @Override
    public Memory createMemory() {
        return new XboxMemory();
    }

    @Override
    public Processor createProcessor() {
        return new XboxProcessor();
    }

    @Override
    public Harddisk createHardDisk() {
        return new XboxHarddisk();
    }
}

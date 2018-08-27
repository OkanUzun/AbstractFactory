public interface MachineFactory {
    Memory createMemory();
    Processor createProcessor();
    Harddisk createHardDisk();
}

package oldCode;

import exceptions.PcIsNotReadyForProgramming;

public class ProgrammersPc {
    public boolean NotEnoughRam = false;
    public boolean NotEnoughSpaceForProgramming = false;

    public boolean Cpu;
    public boolean Gpu;

    public ProgrammersPc(){}

    public void SetCpu(){
        Cpu = true;
    }
    public void SetGpu(){
        Gpu=true;
    }
    public void NotEnoughSpaceForProgramming(){
        NotEnoughSpaceForProgramming=true;
    }
    public void NotEnoughRam(){
        NotEnoughRam=true;
    }

    public void turnOn() throws PcIsNotReadyForProgramming {
        if (NotEnoughRam && NotEnoughSpaceForProgramming && Cpu && Gpu){
            System.out.println("Pc is ready for programming");
        } else {
            throw new PcIsNotReadyForProgramming("Pc is not ready to start");
        }
    }
   public class Main{
        public static void main(String[] args) {
            ProgrammersPc pc = new ProgrammersPc();
            pc.SetCpu();
            pc.SetGpu();
            pc.NotEnoughRam();
            pc.NotEnoughSpaceForProgramming();
            try{
                pc.turnOn();
            } catch(PcIsNotReadyForProgramming e){
                System.out.println(e.getMessage());
            }
        }
    }
}
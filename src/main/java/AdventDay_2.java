import java.util.List;

public class AdventDay_2{
    public String returnTestString(){
        return "Advent Day Two Test!";
    }

	public List<Integer> runOpcode(List<Integer> opcode) {
        
        Boolean solving = true;        
        int currentIdx = 0;
        int opCodeIncrement = 4;
        while(solving){
            switch(opcode.get(currentIdx)){
                case 1:                    
                    opcode.set( opcode.get((currentIdx + 3)), opcode.get(opcode.get(currentIdx + 1)) + opcode.get(opcode.get(currentIdx + 2)));
                    currentIdx += opCodeIncrement;
                break;
                case 2:
                    opcode.set( opcode.get((currentIdx + 3)), opcode.get(opcode.get(currentIdx + 1)) * opcode.get(opcode.get(currentIdx + 2)));
                    currentIdx += opCodeIncrement;
                break;
                case 99:
                    solving = false;
                break;
                default:
                    solving = false;
            }
        }

        return opcode;
	}
}
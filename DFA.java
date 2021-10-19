public class DFA {
    private boolean isAcceptable;
    private String bitString;

    public DFA(String bitString){
        this.bitString = bitString;
        InitialState(0);
    }

    public boolean getAcceptability() {
        return isAcceptable;
    }

    public void setAcceptability(boolean acceptability) {
        isAcceptable = acceptability;
    }

    private void InitialState(int symbolIndex){
        boolean isFinal = true;
        
        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateB(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateC(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateB(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateB(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateE(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateC(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateD(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateC(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateD(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateB(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateG(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateE(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateF(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateC(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateF(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateB(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateI(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateG(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateH(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateC(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateH(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateB(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateJ(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateI(int symbolIndex) {
        boolean isFinal = true;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateJ(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateC(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }

    private void StateJ(int symbolIndex) {
        boolean isFinal = false;

        if(symbolIndex == bitString.length()){
            if(isFinal){
                setAcceptability(true);
                return;
            }else{
                setAcceptability(false);
                return;
            }
        }

        if(bitString.charAt(symbolIndex) == '0'){
            symbolIndex++;
            StateJ(symbolIndex);
        }else if(bitString.charAt(symbolIndex) == '1'){
            symbolIndex++;
            StateJ(symbolIndex);
        }else{
            setAcceptability(false);
        }
    }
}

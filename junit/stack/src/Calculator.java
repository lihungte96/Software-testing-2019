Class calculator{
    private int input1;
    private int input2;
    private char operator;

    public Calculator(){
        input1 = 0;
        input2 = 0;
        operator = ' ';
    }

    public int cal(int input1, int input2, char op){
        int answer;
        switch (operator){
            case('+'):
                answer = addition(input1, input2);
                break;
            case('-'):
                answer = subtraction(input1, input2);
                break;
            default:
                throw new Exception();
        }
        return answer;
    }

    public int addition(){
	return input1 + input2;
    }

    public int subtraction(){
        return input1 - input2;
    }
}

public class Expressionstack {
    int size;
    char stack[];
    int top = -1;
    Expressionstack() {
        size = 190;
        stack =  new char[size];
    }

    void push(char data){
        if(top == size - 1){
            System.out.println("Overflow");
            return;
        }
        stack[++top ] = data;
    }
    char pop (){
        if(top == -1){
            System.out.println("Underflow");

        }
        return stack[top--];
    }
    char peek(){
        return stack[top];
    }
    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    boolean isValid(String exp){
        Expressionstack s1 = new Expressionstack();
        for(char c : exp.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                s1.push(c);
            }else if (c == '}'|| c == ')' || c== ']'){
                if (s1.isEmpty()){
                    return false;
                }
                
           char current  = s1.pop();
            if(current == '{' && c!= '}'|| 
            current == '(' && c!= ')' || 
            current == '[' && c!= ']'){
                return false;
            }
        }
    }
            if (s1.isEmpty()){
                return true;
            }
            return false;
        

        }
        public static void main (String[] args){
            Expressionstack s1 = new Expressionstack();
            System.out.print(s1. isValid("())"));
        }
    }

static void calc(double numA, double numB, char operation) {
    double result;
    switch (operation) {
        case '+':
            result = numA + numB;
            break;
        case '-':
            result = numA - numB;
            break;
        case '*':
            result = numA * numB;
            break;
        case '/':
            if (numB != 0) {
                result = numA / numB;
            } else {
                System.out.println("Division by zero is not allowed");
                return;
            }
            break;
        default:
            System.out.println("Ups, incorrect operation type");
            return;
    }
    System.out.println("Result: " + result);
}

public void main() {
}

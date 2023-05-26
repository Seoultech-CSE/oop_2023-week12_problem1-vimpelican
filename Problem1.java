import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        // int, double형을 동시에 저장하기 위한 Number 자료형
        ArrayList<Number> list = new ArrayList<Number>();
        System.out.print("Enter five integers and five doubles: ");
        int numberOfInputs = 10;
        
        // 입력값에 따라 저장
        for(int i = 0; i < numberOfInputs; i++) {
            String inputStr = input.next(); 
            Number inputNum;

            if(inputStr.contains(".")) 
                inputNum = Double.parseDouble(inputStr);
            else
                inputNum = Integer.parseInt(inputStr);
            
            list.add(inputNum);
        }

        sort(list);

        // 출력
        for(int i = 0; i < numberOfInputs; i++) {
            System.out.print(list.get(i) + " ");
        }
    } 
    
    // SelectionSort
    public static void sort(ArrayList<Number> input) {
        int SIZE = input.size();

        for(int i = 0; i < SIZE - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < SIZE; j++) {
                // double 형으로 변환하여 비교
                if(input.get(j).doubleValue() < input.get(minIndex).doubleValue())
                    minIndex = j;
            }
            // 값 정렬
            Number temp = input.get(i);
            input.set(i, input.get(minIndex));
            input.set(minIndex, temp);
        }
    }
}

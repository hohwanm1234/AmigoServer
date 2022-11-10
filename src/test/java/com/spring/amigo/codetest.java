package com.spring.amigo;

import io.swagger.models.auth.In;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

/*
문제 설명
햄버거 가게에서 일을 하는 상수는 햄버거를 포장하는 일을 합니다.
함께 일을 하는 다른 직원들이 햄버거에 들어갈 재료를 조리해 주면 조리된 순서대로 상수의 앞에 아래서부터 위로 쌓이게 되고, 상수는 순서에 맞게 쌓여서 완성된 햄버거를 따로 옮겨 포장을 하게 됩니다.
상수가 일하는 가게는 정해진 순서(아래서부터, 빵 – 야채 – 고기 - 빵)로 쌓인 햄버거만 포장을 합니다.
상수는 손이 굉장히 빠르기 때문에 상수가 포장하는 동안 속 재료가 추가적으로 들어오는 일은 없으며, 재료의 높이는 무시하여 재료가 높이 쌓여서 일이 힘들어지는 경우는 없습니다.

[2,1,1,2,3,1,2,3,1]
예를 들어, 상수의 앞에 쌓이는 재료의 순서가 [야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵]일 때, 상수는 여섯 번째 재료가 쌓였을 때,
세 번째 재료부터 여섯 번째 재료를 이용하여 햄버거를 포장하고, 아홉 번째 재료가 쌓였을 때, 두 번째 재료와 일곱 번째 재료부터 아홉 번째 재료를 이용하여 햄버거를 포장합니다.
즉, 2개의 햄버거를 포장하게 됩니다.
상수에게 전해지는 재료의 정보를 나타내는 정수 배열 ingredient가 주어졌을 때, 상수가 포장하는 햄버거의 개수를 return 하도록 solution 함수를 완성하시오.

제한사항
1 ≤ ingredient의 길이 ≤ 1,000,000
ingredient의 원소는 1, 2, 3 중 하나의 값이며, 순서대로 빵, 야채, 고기를 의미합니다.
입출력 예
ingredient	result
[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
[1, 3, 2, 1, 2, 1, 3, 1, 2]	0
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.
입출력 예 #2

상수가 포장할 수 있는 햄버거가 없습니다.
*/

@SpringBootTest
class codetest {
    /*
     * 2022-11-07
     * 햄버거 만들기 (스택)
     * @Author 문호환 (Main)
     * @return
     */
    @Test
    public int Solution(int[] ingredient) {

        Stack<Integer> ingredients = new Stack<>();
        int answer = 0;

        for (int num=0; num<ingredient.length; num++) {
            ingredients.push(ingredient[num]);
            int size = ingredients.size();
            if (size > 3 && ingredients.peek() == 1
                         && ingredients.get(size-2) == 3
                         && ingredients.get(size-3) == 2
                         && ingredients.get(size-4) == 1) {

                ingredients.pop();
                ingredients.pop();
                ingredients.pop();
                ingredients.pop();

                answer++;
            }
        }

        return answer;
    }
}

/*
    @Autowired
    static String N; // 파일 갯수
    @Autowired
    static char[] Fname; // 파일 이름
    @Test
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        //선 입력 받은 Arr 제외하고 반복문
        for(int i=0; i<N-1; i++) {
            Fname = br.readLine().toCharArray();
            for(int j=0; j<arr.length; j++) {
                // 패턴과 입력값이 다른값이 있으면 '?'로 변경
                if(arr[j] != Fname[j]) {
                    arr[j] = '?';
                }
            }
        }
        System.out.println(arr);
    }*/

    /*
     * 2022-06-18
     * 행렬 체크
     * @Author 문호환
     * @param x, y
     * @return
     */

/*    public static void search(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int[] xy = queue.poll();

            for(int i=0; i<4; i++) {
                int nextX = xy[0]+dx[i];
                int nextY = xy[1]+dy[i];

                if(nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || arrived[nextX][nextY] || map[nextX][nextY] == 0) {
                    continue;
                }
                queue.add(new int[] {nextX, nextY});
                arrived[nextX][nextY] = true;
                map[nextX][nextY] = map[xy[0]][xy[1]] + 1;
            }
        }
    }
}*/

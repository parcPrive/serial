package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LunchService {
    // 저장한다.
    public void writeLunch(List<Lunch> lunchList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("/Users/junghunmok/Desktop/serial/lunch.txt"))) {  // 여기에 lunch 텍스트 파일이 없으면 자동 생성한다. 본인 로컬 입니다.
            oos.writeObject(lunchList); // 리스트 전체 저장
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 읽어온다.
    public List<Lunch> readLunch() {
        List<Lunch> list = new ArrayList<>();
        File file = new File("/Users/junghunmok/Desktop/serial/lunch.txt"); // 내로컬에 있는 폴더안에 텍스트 파일
        if (!file.exists()) return list; // 없으면 빈배열

        try (ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream(file))) {
            list = (List<Lunch>) ois.readObject(); // 리스트 전체 읽기
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}

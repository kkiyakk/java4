package ex4;

import java.time.Clock;

class MyClock {  // 표준 class이름인 Clock과 겹침 -> MyClock으로 변경
    String time;

    void setTime(String t) {
        this.time = t;
    } // void형이므로 return이 불가능 -> this사용

    String getTime() {
        return time;
    }  //void 형은 return이 불가능 -> String타입으로 변환
}

class ClockTestDrive {
    public static void main(String[] args) {
        MyClock c = new MyClock();  // 바뀐 class명으로 변경

        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
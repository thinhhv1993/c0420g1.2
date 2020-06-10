package Bai4.LopVsDoiTuong.baitap.bai2.XayDungLopStopWatch;


public class StopWatch {
    private long startTime,endTime;
    public StopWatch(){
        this.startTime=System.currentTimeMillis();
    }

    public long getStartTime() {

        return startTime;
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {

        return this.endTime - this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public void setEndTime(long endTime) {

        this.endTime = endTime;
    }

    public void display() {

        System.out.println(this.startTime);
    }

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for(int i = 0 ; i < 1000000; i ++){
            System.out.println(i);
        }
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());

    }
}

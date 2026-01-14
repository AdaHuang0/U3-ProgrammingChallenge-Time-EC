package com.example.project;


public class Time{
    //PRIVATE INSTANCE VARIABLES HERE
    private int min;
    private int sec;
    private int hr;

    //CONSTRUCTOR HERE 
    //constructure should take in 3 parameters (int hour, int minute, int seconds)
    public Time(int hour, int minute, int seconds) {
        min = minute;
        hr = hour;
        sec = seconds;
    }

    //GETTERS 
 

    public String info(){
        String hrs = "" + hr;
        String mins = "" + min;
        String secs = "" + sec;

        if (hr < 10) {
            hrs = "0" + hrs;
        }
        if (min < 10) {
            mins = "0" + mins;
        }
        if (sec < 10) {
            secs = "0" + secs;
        }
        return hrs + ":" + mins + ":" + secs;
    }


    public void tick(){
      sec++;
      if (sec >= 60) {
        min++;
        sec = 0;
      }
      if (min >= 60) {
        hr++;
        min = 0;
      }
      if (hr >= 24) {
        hr = 0;
        sec = 0;
        min = 0;
      }
    }


    public void add(Time time2){
        this.sec += time2.sec;
        this.min += time2.min;
        this.hr += time2.hr;
         if (this.sec >= 60) {
          this.min += this.sec / 60;
          this.sec = this.sec % 60;
         }
         if (this.min >= 60) {
          this.hr += this.min / 60;
          this.min = this.min % 60;
         }
         if (this.hr >= 24) {
          this.hr = this.hr % 24;   
         }
    }
}


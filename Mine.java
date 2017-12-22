/*<applet code = "Mine" width = "400" height = "400"></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.events.*;

public class Mine extends Applet implements AcrionListener{

Button stop,play;
Label l1; AudioClip a;
public void init(){
play = new button("play");
add(play);
play.addActionListener(this);

   stop = new Button("stop");
   add(stop);
   stop.addActionListener(this);

  l1 = new Label("song will play");
  add(l1);
    a = getAudioClip(getCodeBase(),"Itachi_Uchiha_Theme_-_Extended_Full-HD.wav");

    }
  //  public void start(){
    public void actionPerformed(ActionEvent ae){

    Button s = (Button)ae.getSource();
    if(ae.getSource() == play){
    a.play();
    }

    else if(ae.getSource() == stop){
    a.stop();
    }

  //   }
      }
    }//class termination

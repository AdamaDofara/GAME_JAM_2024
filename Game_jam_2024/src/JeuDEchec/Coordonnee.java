/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JeuDEchec;

/**
 *
 * @author guill
 */
public class Coordonnee {
    private int x;
    private int y;
    
   public Coordonnee(int x, int y){
   this.x=x;
   this.y= y;
      
   }
  
    
    public int getx(){
        return this.x;
    }
    public int gety(){
        return this.y;
    }
    public void setx(int a){
        this.x=a;
    }
    public void sety(int a){
        this.y=a;
    }
}

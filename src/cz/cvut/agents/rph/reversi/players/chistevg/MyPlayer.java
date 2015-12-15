/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cz.cvut.agents.rph.reversi.players.chistevg;

import cz.cvut.agents.rph.reversi.ReversiMove;
import cz.cvut.agents.rph.reversi.ReversiPlayer;

/**
 *
 * @author chistevg
 */
public class MyPlayer extends ReversiPlayer{
    
     public String getName(){
        return "chistevg";
    }
    
    public ReversiMove makeNextMove(int[][] board){
        return new ReversiMove(3,5);
        
        

         
    }
    
    
    
}

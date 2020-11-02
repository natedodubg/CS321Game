package game;

/*
 * CS321-01 project team 5
 * authors: dillon griffin, cameron jones, sierra laney, nathan mcgee, and carden roden
 */

public class B_Tree {
    
   node root; // the root of the binary tree #1
   
   //constructor
   B_Tree(){
       root=null;
   }
   
  public B_Tree(int data, String story){
       
      root = new node(data, story);
      
   }
   
        
        
    
}


class node{
    
     int data;
     String story;
     node left;
     node right; //left and right children
    
    
    //constructor
        public  node(int t_data, String t_story){
            data=t_data; 
            left=null;
            right=null;
            story=t_story;
      }
}



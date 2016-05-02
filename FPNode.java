/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kripa Kalyanaraman
 */
import java.util.ArrayList;
import java.util.List;

import ItemSet.ItemSet;

public class FPNode {
    int itemID = -1;  // item id
	int counter = 1;  // frequency counter  (a.k.a. support)
	
	// the parent node of that node or null if it is the root
	FPNode parent = null; 
	// the child nodes of that node
	List<FPNode> childs = new ArrayList<FPNode>();
	
	FPNode nodeLink = null; // link to next node with the same item id (for the header table).
	
	/**
	 * constructor
	 */
	FPNode(){
		
	}

	/**
	 * Return the immmediate child of this node having a given ID.
	 * If there is no such child, return null;
	 */
	FPNode getChildWithID(int id) {
		// for each child node
		for(FPNode child : childs){
			// if the id is the one that we are looking for
			if(child.itemID == id){
				// return that node
				return child;
			}
		}
		// if not found, return null
		return null;
	}
}

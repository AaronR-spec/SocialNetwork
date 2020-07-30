/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.util.HashMap;
import java.util.HashSet;
import posts.Post;

/**
 *
 * @author aaron
 */
public class Account
{
    String name, accountId;
    HashMap<String,Post> posts = new HashMap<>();
    //account id list of friends
    HashSet<String> friends = new HashSet<>();
    boolean accountPrivate;
}

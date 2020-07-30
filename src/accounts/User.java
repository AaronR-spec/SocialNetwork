/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import java.util.HashMap;
import posts.Post;

/**
 *
 * @author aaron
 */
public class User
{
    String name, accountId;
    HashMap<String,Account> friends = new HashMap<>();
    HashMap<String,Account> mutualFriends = new HashMap<>();
    HashMap<String,Post> posts = new HashMap<>();
    boolean accountPrivate;
}

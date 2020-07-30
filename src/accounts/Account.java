
package accounts;

import java.util.HashMap;
import posts.Post;

/**
 *
 * @author aaron
 */
public class Account
{
    static int idIndex = 0;
    String name,accountId; 
    HashMap<String, Post> posts = new HashMap<>();
    HashMap<String, Friend> friends = new HashMap<>();
    HashMap<String, MutualFriend> mutralFriends = new HashMap<>();
    boolean accountPrivate;


}

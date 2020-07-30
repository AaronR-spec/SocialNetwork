
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
    
    public User(String name,String accountId,HashMap<String,Account> friends, HashMap<String,Account> mutalFriends,HashMap<String,Post> posts)
    {
        this.name = name;
        this.accountId = accountId;
        this.friends = friends; 
        this.mutualFriends = mutalFriends;
        this.posts = posts;
    }

    public String getName()
    {
        return name;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public HashMap<String, Account> getFriends()
    {
        return friends;
    }

    public HashMap<String, Account> getMutualFriends()
    {
        return mutualFriends;
    }

    public HashMap<String, Post> getPosts()
    {
        return posts;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public void setFriends(HashMap<String, Account> friends)
    {
        this.friends = friends;
    }

    public void setMutualFriends(HashMap<String, Account> mutualFriends)
    {
        this.mutualFriends = mutualFriends;
    }

    public void setPosts(HashMap<String, Post> posts)
    {
        this.posts = posts;
    }

    @Override
    public String toString()
    {
        return "User{" + "name=" + this.getName() + ", accountId=" + this.getAccountId() + ", friends=" + this.getFriends() + ", mutualFriends=" + this.getMutualFriends() + ", posts=" + this.getPosts() + '}';
    }
    
}

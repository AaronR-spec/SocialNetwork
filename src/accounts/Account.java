

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

    public Account(String name, String accountId, boolean accountPrivate)
    {
        this.name = name;
        this.accountId = accountId;
        this.accountPrivate = accountPrivate;
    }

    public String getName()
    {
        return name;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public HashMap<String, Post> getPosts()
    {
        return posts;
    }

    public HashSet<String> getFriends()
    {
        return friends;
    }

    public boolean isAccountPrivate()
    {
        return accountPrivate;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public void setPosts(HashMap<String, Post> posts)
    {
        this.posts = posts;
    }

    public void setFriends(HashSet<String> friends)
    {
        this.friends = friends;
    }

    public void setAccountPrivate(boolean accountPrivate)
    {
        this.accountPrivate = accountPrivate;
    }

    @Override
    public String toString()
    {
        return "Account{" + "name=" + this.getName() + ", accountId=" + this.getAccountId() + ", posts=" + this.getPosts() + ", friends=" + this.getFriends() + ", accountPrivate=" + this.isAccountPrivate() + '}';
    }
    
}

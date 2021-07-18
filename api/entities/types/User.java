package api.entities.types;

public class User {
    public Long id; // INT64
    public boolean is_bot;
    public String first_name;
    public String last_name;
    public String username;
    public String language_code;
    public boolean can_join_groups;
    public boolean can_read_all_group_messages;
    public boolean supports_inline_queries;
}

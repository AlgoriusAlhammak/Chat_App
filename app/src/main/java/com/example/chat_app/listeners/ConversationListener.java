package com.example.chat_app.listeners;

import com.example.chat_app.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}

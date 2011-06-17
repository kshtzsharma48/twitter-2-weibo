package com.rakutec.weibo.filters;

public class TagStatusFilter implements StatusFilter {
    @Override
    public String filter(String input) {
        if (input == null) return input;
        return input.replaceAll("(#\\w+)", "$1#");
    }
}

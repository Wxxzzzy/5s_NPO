package model;

import java.util.*;

public class SearchModel {
    private String searchInput;

    public SearchModel(String searchInput) {
        this.searchInput = searchInput;
    }

    public String getSearchInput() {
        return searchInput;
    }

    public void setSearchInput(String searchInput) {
        this.searchInput = searchInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchModel that = (SearchModel) o;
        return Objects.equals(searchInput, that.searchInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchInput);
    }

    @Override
    public String toString() {
        return "SearchModel{" +
                "searchInput='" + searchInput + '\'' +
                '}';
    }
}

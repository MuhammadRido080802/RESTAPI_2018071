package com.kotdev.food.helpers.util;

import com.kotdev.food.R;

public class Constants {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static final String BASE_URL_IMAGE = "https://recipesapi.herokuapp.com";
    public static final String QUERY_EXHAUSTED = "Query is exhausted.";

    public static final int CONNECTION_TIMEOUT = 10;

    public static final int READ_TIMEOUT = 2;

    public static final int WRITE_TIMEOUT = 2;

    public static final long RECIPE_REFRESH_TIME = 60 * 60 * 24 * 30; // 30 days to refresh recipe

    public static final int[] DEFAULT_SEARCH_CATEGORY_IMAGES =
            {
                    R.drawable.casio,
                    R.drawable.bvlgari,
                    R.drawable.fossil,
                    R.drawable.rolex,
                    R.drawable.gucci,
                    R.drawable.gshock,
                    R.drawable.guess

            };

    public static final String[] DEFAULT_SEARCH_CATEGORIES =
            {"Barbeque", "Breakfast", "Chicken", "Beef", "Brunch", "Dinner", "Wine", "Italian"};

}

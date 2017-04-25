package ch.ralena.sifatrecipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import ch.ralena.sifatrecipe.fragments.RecipeListFragment;

public class MainActivity extends AppCompatActivity {

	private static final String TAG_RECIPE_FRAGMENT = "tag recipe fragment";
	Fragment mainFragment;
	private RecipeListFragment recipeFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentManager fragmentManager = getSupportFragmentManager();

		recipeFragment = new RecipeListFragment();
		fragmentManager
				.beginTransaction()
				.add(R.id.fragmentPlaceholder, recipeFragment, TAG_RECIPE_FRAGMENT)
				.commit();
	}
}

package ca.kallanou.itunesfinder.ui.base.di.search

import ca.kallanou.itunesfinder.ui.features.search.SearchFragment
import dagger.Subcomponent

@SearchScope
@Subcomponent(modules = [SearchAlbumsModule::class])
interface SearchSubComponent {

    fun inject(searchFragment: SearchFragment)

}
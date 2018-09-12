package com.example.anon.superheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: Bit maps Initiated");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/103530/6444044-4130984370-aHR0cDovL3d3dy5uZXdzYXJhbWEuY29tL2ltYWdlcy9pLzAwMC8yMjcvMjY2L29yaWdpbmFsL0pMXzFfdmFyX01hcmtfQnJvb2tzX2IuanBn");
        mNames.add("Wonder Women");
        mDesc.add("The princess of the Amazons, armed with powers of a god, Wonder Woman is one of Earth's most powerful defenders of peace and equality and a member of the Justice League. She is often considered an archetype for the comic book superheroine. She stands for Love, peace, and above all else, truth! Her original origin depicted her as a clay figure brought to life by the gods, but in recent years she has been depicted as the daughter of Zeus and the Amazon queen Hippolyta.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/13/132327/6507037-28872490_1638064799604695_1250122498385004714_n.jpg");
        mNames.add("Super Man");
        mDesc.add("Rocketed to Earth as an infant from the doomed planet Krypton, Kal-El was adopted by the loving Kent family and raised in America's heartland as Clark Kent. Using his immense solar-fueled powers, he became Superman to defend mankind against all manner of threats while championing truth, justice and the American way!");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6198653-batman+12.jpg");
        mNames.add("Bat Man");
        mDesc.add("Bruce Wayne, who witnessed the murder of his multi-millionaire parents as a child, swore to avenge their deaths. He trained extensively to achieve mental and physical perfection, mastering martial arts, detective skills, and criminal psychology. Costumed as a bat to prey on the fears of criminals, and utilizing a high-tech arsenal, he became the legendary Batman.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/11124/111242198/4833020-mark_bagley_spider_man.jpg");
        mNames.add("Spider Man");
        mDesc.add("Peter Parker was bitten by a radioactive spider as a teenager, granting him spider-like powers. After the death of his Uncle Ben, which he could have prevented, Peter learned that \"with great power, comes great responsibility.\" Swearing to always protect the innocent from harm, Peter Parker became the Amazing Spider-Man!");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6436253-thor2.jpg");
        mNames.add("Thor");
        mDesc.add("Thor is the Asgardian God of Thunder, and the son of the All-Father of Asgard Odin and the Elder Earth-Goddess Gaea. Combining the powers of Asgard and Midgard (Earth), Thor is arguably the greatest defender of both worlds. Armed with his enchanted Uru hammer Mjolnir, which can only be lifted by those who are worthy, Thor is the mightiest warrior in all of Asgard. A staunch ally for good and one of the strongest beings on Earth, Thor is also a founding member of the Avengers.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/11114/111147698/6520709-1532011657748.jpg");
        mNames.add("Hal Jordan");
        mDesc.add("With the ability to overcome great fear and harness the power of will, test-pilot Hal Jordan was chosen to be the Green Lantern of Sector 2814 inheriting the ring of the dying alien Green Lantern, Abin Sur. Through sheer will power and determination, Hal has established an impressive record of heroism across the galaxy with the help of his fellow Green Lanterns as well as his peers in the Justice League.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/13/132327/6421118-captain_america_2_by_leinilyu-d4jupy4.jpg");
        mNames.add("Captain America");
        mDesc.add("During World War II, Steve Rogers volunteered to receive the experimental Super-Soldier Serum. Enhanced to the pinnacle of human physical potential and armed with an unbreakable shield, he became Captain America. After a failed mission left him encased in ice for decades, he was found and revived by the Avengers. Later joining their ranks and eventually becoming the team's leader.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/103530/6444307-7938467445-STL082429");
        mNames.add("Martian Man Hunter");
        mDesc.add("Sole survivor of the Martian people, J'onn J'onzz was teleported to Earth decades ago by Dr. Saul Erdel. Since then, he has adopted Earth as his new home, playing many roles over his time with humanity: detective, secret agent, explorer, and even a pillar of the Justice League.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/10/100647/6436334-nightwing+39+yasmine+putri+variant.jpg");
        mNames.add("Dick Greyson");
        mDesc.add("As the first Robin, Dick Grayson was the most famous sidekick in all of fiction. As he ventured forth on his own, he formed the Teen Titans and became their leader. When the boy became a man, he became the independent hero known as Nightwing.");

        mImageUrls.add("https://static.comicvine.com/uploads/scale_small/14/149570/4171373-4171069-fanfour015_char_var.jpg");
        mNames.add("Thing");
        mDesc.add("Ben Grimm, better known as the Thing, is the original quintessential tough-guy of the Marvel Universe. But, because of his transformation, he's also the tragic member of the Fantastic Four. Ben was an ace test-pilot until exposure to intense cosmic radiation mutated him into a rock-skinned monster with immense superhuman strength. Ben's exterior is much harder than stone which gives him a rather gruff disposition; but deep down, he has a heart of gold.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: Reycler View Initiated");
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

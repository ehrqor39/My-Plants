package androidtown.org.myplants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SetFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SetFragment extends Fragment {

    public static SetFragment newInstance() {
        return new SetFragment();
    }

   Button pro_btn;
   Button alarm_btn;
   Button info_btn;
   ProfileFragment proFrag ;
   InfoFragment infoFrag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_set,null);
        pro_btn = rootView.findViewById(R.id.set_pro);
        proFrag = new ProfileFragment();
        alarm_btn = rootView.findViewById(R.id.set_alarm);

        info_btn = rootView.findViewById(R.id.set_info);
        infoFrag = new InfoFragment();
        pro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager = getFragmentManager();
                FragmentTransaction ftrans = fmanager.beginTransaction();
                ftrans.replace(R.id.container, proFrag).commit();
            }
        });

        info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fmanager = getFragmentManager();
                FragmentTransaction ftrans = fmanager.beginTransaction();
                ftrans.replace(R.id.container, infoFrag).commit();
            }
        });
        // Inflate the layout for this fragment
        return  rootView;
    }
}

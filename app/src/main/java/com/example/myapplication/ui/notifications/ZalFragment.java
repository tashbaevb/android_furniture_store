package com.example.myapplication.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.myapplication.MAdapter;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentZalBinding;
import com.example.myapplication.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {

    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZal.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("zal", "Гостинный Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
                " матрас набивной пружинный, кокосовая стружка", R.drawable.download));
        list_zal.add(new FurnitureModel("zal", "Гостинный Red_sunrise", "1100",
                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," + "набивной, специальный состав"
                , R.drawable.download_2));
        list_zal.add(new FurnitureModel("zal", "Гостинный Plot", "1340",
                " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," + "набивной, специальный состав"
                , R.drawable.download_3));
        list_zal.add(new FurnitureModel("zal", "Гостинный Parlament", "1200",
                " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," + "набивной, специальный состав"
                , R.drawable.download_4));
        list_zal.add(new FurnitureModel("zal", "Гостинный Red Flame", "1690",
                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," + " матрас набивной пружинный, кокосовая стружка", R.drawable.download_5));
        list_zal.add(new FurnitureModel("zal", "Гостинный Red_sunrise", "1100", " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
                "набивной, специальный состав", R.drawable.download));
        list_zal.add(new FurnitureModel("zal", "Гостинный Plot", "1340", " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," +
                "набивной, специальный состав", R.drawable.download_2));
        list_zal.add(new FurnitureModel("zal", "Гостинный Parlament", "1200", " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," +
                "набивной, специальный состав", R.drawable.download_3));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_zal_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
package com.example.myapplication.ui.kitchen;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.myapplication.MAdapter;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentGardenBinding;
import com.example.myapplication.databinding.FragmentKitchenBinding;
import com.example.myapplication.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class KitchenFragment extends Fragment {

    private FragmentKitchenBinding binding;

    List<FurnitureModel> list_kitchen = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentKitchenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kitchen);
        binding.rvKitchen.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
                " матрас набивной пружинный, кокосовая стружка", R.drawable.download));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Red_sunrise", "1100",
                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," + "набивной, специальный состав"
                , R.drawable.download_2));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Plot", "1340",
                " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," + "набивной, специальный состав"
                , R.drawable.download_3));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Parlament", "1200",
                " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," + "набивной, специальный состав"
                , R.drawable.download_4));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Red Flame", "1690",
                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," + " матрас набивной пружинный, кокосовая стружка", R.drawable.download_5));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Red_sunrise", "1100", " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
                "набивной, специальный состав", R.drawable.download));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Plot", "1340", " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," +
                "набивной, специальный состав", R.drawable.download_2));
        list_kitchen.add(new FurnitureModel("kitchen", "Кухонный Parlament", "1200", " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," +
                "набивной, специальный состав", R.drawable.download_3));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_kitchenFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
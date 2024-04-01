package com.example.myapplication.ui.sale;

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
import com.example.myapplication.databinding.FragmentSaleBinding;
import com.example.myapplication.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class SaleFragment extends Fragment {

    private FragmentSaleBinding binding;

    List<FurnitureModel> list_sale = new ArrayList<>();
    MAdapter adapter;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_sale);
        binding.rvSale.setAdapter(adapter);
        return root;
    }


    private void createList() {
        list_sale.add(new FurnitureModel("garden", "Сад Red Flame", "1690", "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
                " матрас набивной пружинный, кокосовая стружка", R.drawable.download));
        list_sale.add(new FurnitureModel("garden", "Садовая Red_sunrise", "1100",
                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," + "набивной, специальный состав"
                , R.drawable.download_2));
        list_sale.add(new FurnitureModel("zal", "Гостевой Plot", "1340",
                " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," + "набивной, специальный состав"
                , R.drawable.download_3));
        list_sale.add(new FurnitureModel("kitchen", "Кухонный Стол", "1200",
                " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," + "набивной, специальный состав"
                , R.drawable.download_4));
        list_sale.add(new FurnitureModel("garden", "Сад Red Flame", "1690",
                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," + " матрас набивной пружинный, кокосовая стружка", R.drawable.download_5));
        list_sale.add(new FurnitureModel("bed_room", "Спальня Red_sunrise", "1100", " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
                "набивной, специальный состав", R.drawable.download));
        list_sale.add(new FurnitureModel("garden", "Сад Plot", "1340", " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," +
                "набивной, специальный состав", R.drawable.download_2));
        list_sale.add(new FurnitureModel("zal", "Гостевой Parlament", "1200", " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," +
                "набивной, специальный состав", R.drawable.download_3));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_saleFragment_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
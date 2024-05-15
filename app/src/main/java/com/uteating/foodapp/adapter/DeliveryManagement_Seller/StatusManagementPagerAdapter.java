package com.uteating.foodapp.adapter.DeliveryManagement_Seller;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.uteating.foodapp.fragment.DeliveryManagement_Seller.CompletedStatusDeliveryFragment;
import com.uteating.foodapp.fragment.DeliveryManagement_Seller.ConfirmStatusDeliveryFragment;
import com.uteating.foodapp.fragment.DeliveryManagement_Seller.ShippingStatusDeliveryFragment;

public class StatusManagementPagerAdapter extends FragmentStateAdapter {
    private String userId;

    public StatusManagementPagerAdapter(@NonNull FragmentActivity fragmentActivity,String Id) {
        super(fragmentActivity);
        userId = Id;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new ShippingStatusDeliveryFragment(userId);
            case 2:
                return new CompletedStatusDeliveryFragment(userId);
            default:
                return new ConfirmStatusDeliveryFragment(userId);
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

}

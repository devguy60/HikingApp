package com.example.harimao.hikingapp;

import android.app.Dialog;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;
import android.widget.Button;

/**
 * Created by Harimao on 10/10/16.
 */

public class ModalCustomBottomSheet extends BottomSheetDialogFragment {

    @Override
    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.modal_sheet, null);
        dialog.setContentView(contentView);

        Button button = (Button) contentView.findViewById(R.id.modal_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

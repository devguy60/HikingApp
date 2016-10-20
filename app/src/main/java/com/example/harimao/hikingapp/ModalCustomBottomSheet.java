package com.example.harimao.hikingapp;

import android.app.Dialog;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Button;

/**
 * Created by Harimao on 10/10/16.
 */

public class ModalCustomBottomSheet extends BottomSheetDialogFragment {

    private BottomSheetBehavior mBottomSheetBehavior;

    @Override
    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.modal_sheet, null);
        dialog.setContentView(contentView);

        View bottomSheet = getActivity().findViewById(R.id.bottom_sheet);
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);

        Button button = (Button) contentView.findViewById(R.id.modal_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBottomSheetBehavior.setPeekHeight(250);
                FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
                fab.setVisibility(View.INVISIBLE);
                FloatingActionButton bottomSheetFab = (FloatingActionButton) getActivity().findViewById(R.id.bottom_sheet_fab);
                bottomSheetFab.setVisibility(View.VISIBLE);
                dismiss();
            }
        });
    }
}

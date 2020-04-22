package com.example.e_suratpermintaan.di

import com.e_suratpermintaan.core.usecases.auth.DoLoginUseCase
import com.e_suratpermintaan.core.usecases.itemsuratpermintaan.AddItemSuratPermintaanUseCase
import com.e_suratpermintaan.core.usecases.itemsuratpermintaan.EditItemSuratPermintaanUseCase
import com.e_suratpermintaan.core.usecases.itemsuratpermintaan.ReadDetailItemSuratPermintaanUseCase
import com.e_suratpermintaan.core.usecases.itemsuratpermintaan.RemoveItemSuratPermintaanUseCase
import com.e_suratpermintaan.core.usecases.master.GetCostCodeListUseCase
import com.e_suratpermintaan.core.usecases.master.GetJenisListUseCase
import com.e_suratpermintaan.core.usecases.master.GetPersyaratanListUseCase
import com.e_suratpermintaan.core.usecases.master.GetProyekListUseCase
import com.e_suratpermintaan.core.usecases.profile.GetProfileUseCase
import com.e_suratpermintaan.core.usecases.suratpermintaan.*
import com.example.e_suratpermintaan.presentation.viewmodel.*
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        SuratPermintaanViewModel(
            get() as AddSuratPermintaanUseCase,
            get() as ReadAllDataSuratPermintaanUseCase,
            get() as ReadMyDataSuratPermintaanUseCase,
            get() as RemoveSuratPermintaanUseCase,
            get() as ReadDetailSuratPermintaanUseCase,
            get() as EditSuratPermintaanUseCase,
            get() as VerifikasiSuratPermintaanUseCase,
            get() as AjukanSuratPermintaanUseCase,
            get() as CancelSuratPermintaanUseCase
        )
    }
    viewModel {
        AuthViewModel(
            get() as DoLoginUseCase
        )
    }
    viewModel {
        ProfileViewModel(
            get() as GetProfileUseCase
        )
    }
    viewModel {
        MasterViewModel(
            get() as GetProyekListUseCase,
            get() as GetJenisListUseCase,
            get() as GetCostCodeListUseCase,
            get() as GetPersyaratanListUseCase
        )
    }
    viewModel {
        ItemSuratPermintaanViewModel(
            get() as AddItemSuratPermintaanUseCase,
            get() as RemoveItemSuratPermintaanUseCase,
            get() as EditItemSuratPermintaanUseCase,
            get() as ReadDetailItemSuratPermintaanUseCase
        )
    }
}
package com.square.employeeconnect

interface BaseActivityContract {
    interface View {
        fun launchEmployeesFragment()
    }

    interface Presenter {
        fun callLaunchFragment()
    }
}
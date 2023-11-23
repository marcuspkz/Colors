package com.marcus.colores

import android.app.Dialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Colors : AppCompatActivity() {
    private lateinit var rvColors: RecyclerView
    private lateinit var rvAdapter: Adapter
    private lateinit var changeColorButton: Button

    private lateinit var row1: CardView
    private lateinit var row2: CardView
    private lateinit var row3: CardView
    
    private val columnList = mutableListOf(
        ColorColumn("V1 (20%)", "#33FFE500"),
        ColorColumn("V2 (35%)", "#59FFE500"),
        ColorColumn("V3 (50%)", "#80FFE500"),
        ColorColumn("V4 (65%)", "#A6FFE500"),
        ColorColumn("V5 (80%)", "#CCFFE500")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)
        rvColors = findViewById(R.id.rvColors)
        rvAdapter = Adapter(columnList)

        row1 = findViewById(R.id.colorCard1)
        row2 = findViewById(R.id.colorCard2)
        row3 = findViewById(R.id.colorCard3)

        changeColorButton = findViewById(R.id.changeColorButton)
        changeColorButton.setOnClickListener {
            showDialog()
        }

        rvColors.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvColors.adapter = rvAdapter
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.color_dialog)

        val applyColorButton: Button = dialog.findViewById(R.id.applyColorButton)
        val closeColorButton: Button = dialog.findViewById(R.id.closeColorButton)
        val rgColumn: RadioGroup = dialog.findViewById(R.id.rgColumn)
        val rgColor: RadioGroup = dialog.findViewById(R.id.rgColor)

        applyColorButton.setOnClickListener {
            val selectedColumn = rgColumn.checkedRadioButtonId
            val selectedColor = rgColor.checkedRadioButtonId
            changeColor(selectedColor, selectedColumn);
            notifyAdapter();
        }

        closeColorButton.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun notifyAdapter() {
        rvAdapter.notifyDataSetChanged()
    }

    private fun changeColor(selectedColor: Int, selectedColumn: Int) {
        when (selectedColor) {
            R.id.white_check -> {
                //tonalidades de blanco
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#33FFFFFF"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#80FFFFFF"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CCFFFFFF"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#33FFFFFF";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#59FFFFFF";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#80FFFFFF";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A6FFFFFF";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CCFFFFFF";
                    }
                }
            }
            R.id.red_check -> {
                //tonalidades de rojo
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#33FF0000"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#80FF0000"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CCFF0000"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#33FF0000";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#59FF0000";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#80FF0000";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A6FF0000";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CCFF0000";
                    }
                }
            }
            R.id.orange_check -> {
                //tonalidades de naranja
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#33FF5722"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#80FF5722"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CCFF5722"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#33FF5722";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#59FF5722";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#80FF5722";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A6FF5722";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CCFF5722";
                    }
                }
            }
            R.id.yellow_check -> {
                //tonalidades de amarillo
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#33FFE500"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#80FFE500"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CCFFE500"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#33FFE500";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#59FFE500";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#80FFE500";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A6FFE500";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CCFFE500";
                    }
                }
            }
            R.id.green_check -> {
                //tonalidades de verde
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#332BE332"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#802BE332"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CC2BE332"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#332BE332";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#592BE332";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#802BE332";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A62BE332";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CC2BE332";
                    }
                }
            }
            R.id.cyan_check -> {
                //tonalidades de cian
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#3300FFFF"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#8000FFFF"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CC00FFFF"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#3300FFFF";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#5900FFFF";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#8000FFFF";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A600FFFF";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CC00FFFF";
                    }
                }
            }
            R.id.blue_check -> {
                //tonalidades de azul
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#330088FF"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#800088FF"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CC0088FF"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#330088FF";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#590088FF";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#800088FF";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A60088FF";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CC0088FF";
                    }
                }
            }
            R.id.violet_check -> {
                //tonalidades de violeta
                when (selectedColumn) {
                    R.id.h1_check -> {
                        row1.setBackgroundColor(Color.parseColor("#337A33FF"))
                    }
                    R.id.h2_check -> {
                        row2.setBackgroundColor(Color.parseColor("#807A33FF"))
                    }
                    R.id.h3_check -> {
                        row3.setBackgroundColor(Color.parseColor("#CC7A33FF"))
                    }
                    R.id.v1_check -> {
                        columnList[0].color = "#337A33FF";
                    }
                    R.id.v2_check -> {
                        columnList[1].color = "#597A33FF";
                    }
                    R.id.v3_check -> {
                        columnList[2].color = "#807A33FF";
                    }
                    R.id.v4_check -> {
                        columnList[3].color = "#A67A33FF";
                    }
                    R.id.v5_check -> {
                        columnList[4].color = "#CC7A33FF";
                    }
                }
            }
        }
    }
}
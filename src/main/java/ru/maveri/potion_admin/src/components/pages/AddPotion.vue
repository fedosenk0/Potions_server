<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">

    <v-card
            class="mx-auto my-3 pa-6"
            width="500px"
    >
        <template>
            <v-container fluid>
                <v-form class="text-center">

                    <span>Новое зелье</span>
                    <v-row class="py-0 ma-0">

                        <v-col class="py-0 ma-0"  cols="12">
                            <v-text-field label="Название"/>
                        </v-col>



                        <v-row class="py-0 mx-3 my-0 ">

                           <v-col cols="3">
                                <v-text-field
                                        label="значение"
                                        v-model="slider1"
                                ></v-text-field>
                           </v-col>

                            <v-col cols="3">

                                <v-text-field
                                        label="значение"
                                        v-model="slider2"
                                ></v-text-field>
                            </v-col>

                            <v-col cols="3">

                                <v-text-field
                                        label="значение"
                                        v-model="slider3"
                                ></v-text-field>
                            </v-col>

                            <v-col cols="3">

                                <v-text-field
                                        label="значение"
                                        v-model="slider4"
                                ></v-text-field>
                            </v-col>



                        </v-row>
                        <v-col cols="12">
                            <v-progress-linear
                                    color="light-blue"
                                    :value ="(slider1 / 10)*100"/>
                        </v-col>

                        <v-col cols="12">
                            <v-progress-linear
                                    color="light-green darken-4"
                                    :value ="(slider2 / 10)*100"/>
                        </v-col>

                        <v-col cols="12">
                            <v-progress-linear
                                    color="lime"
                                    :value ="(slider3 / 10)*100"/>
                        </v-col>

                        <v-col cols="12">
                            <v-progress-linear
                                    color="deep-orange"
                                    striped
                                    :value ="(slider4 / 10)*100"/>

                        </v-col>


                        <v-col  cols="12">
                            <v-textarea
                                    solo
                                    name="input-7-4"
                                    label="Описание"
                            ></v-textarea>
                        </v-col>

                        <v-col cols="6">
                        <v-btn text large color="primary">Добавить</v-btn>
                        </v-col>

                        <v-col cols="6">
                            <v-btn text large color="error">Отменить</v-btn>

                        </v-col>



                    </v-row>
                </v-form>
            </v-container>
        </template>
    </v-card>




</template>

<script>
    export default {
        data () {
            return {
                slider1: 1,
                slider2: 2 ,
                slider3: 3,
                slider4: 4,
                min: 0,
                max: 6,


            }
        },

    }
</script>

<style scoped>

</style>
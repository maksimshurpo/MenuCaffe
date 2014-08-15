package com.gsugroup.android.cafeter.help;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class HelpJson {

    public static final String devices = "[\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"numberDev\": 1,\n" +
            "        \"name\": \"Nexus 5\",\n" +
            "        \"orders\": [\n" +
            "            {\n" +
            "                \"id\": 1,\n" +
            "                \"timestamp\": \"2014-07-21\",\n" +
            "                \"numberOrder\": 1,\n" +
            "                \"dishesMenu\": {\n" +
            "                    \"id\": 1,\n" +
            "                    \"cost\": 12.3,\n" +
            "                    \"cookingTime\": 10,\n" +
            "                    \"dishesInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"name\": \"Цезарь\",\n" +
            "                        \"description\": \"вкусный салат\",\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    },\n" +
            "                    \"contents\": [\n" +
            "                        {\n" +
            "                            \"id\": 4,\n" +
            "                            \"quantity\": 120,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 2,\n" +
            "                                \"name\": \"морковка\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"грамм\",\n" +
            "                                \"shortName\": \"гр\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 5,\n" +
            "                            \"quantity\": 120,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"name\": \"капуста\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"грамм\",\n" +
            "                                \"shortName\": \"гр\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 6,\n" +
            "                            \"quantity\": 90,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 4,\n" +
            "                                \"name\": \"лук\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"грамм\",\n" +
            "                                \"shortName\": \"гр\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"numberDev\": 2,\n" +
            "        \"name\": \"Nexus 7\",\n" +
            "        \"orders\": [\n" +
            "            {\n" +
            "                \"id\": 2,\n" +
            "                \"timestamp\": \"2014-07-21\",\n" +
            "                \"numberOrder\": 2,\n" +
            "                \"dishesMenu\": {\n" +
            "                    \"id\": 2,\n" +
            "                    \"cost\": 15.4,\n" +
            "                    \"cookingTime\": 13,\n" +
            "                    \"dishesInternalization\": {\n" +
            "                        \"id\": 2,\n" +
            "                        \"name\": \"Греческий\",\n" +
            "                        \"description\": \"очень вкусный салат\",\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    },\n" +
            "                    \"contents\": [\n" +
            "                        {\n" +
            "                            \"id\": 2,\n" +
            "                            \"quantity\": 100,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"name\": \"капуста\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"грамм\",\n" +
            "                                \"shortName\": \"гр\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        },\n" +
            "                        {\n" +
            "                            \"id\": 3,\n" +
            "                            \"quantity\": 120,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 2,\n" +
            "                                \"name\": \"морковка\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"грамм\",\n" +
            "                                \"shortName\": \"гр\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"numberDev\": 3,\n" +
            "        \"name\": \"Nexus 7 2013\",\n" +
            "        \"orders\": [\n" +
            "            {\n" +
            "                \"id\": 3,\n" +
            "                \"timestamp\": \"2014-07-21\",\n" +
            "                \"numberOrder\": 3,\n" +
            "                \"dishesMenu\": {\n" +
            "                    \"id\": 3,\n" +
            "                    \"cost\": 50,\n" +
            "                    \"cookingTime\": 1,\n" +
            "                    \"dishesInternalization\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"40 капель\",\n" +
            "                        \"description\": \"просто огонь\",\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    },\n" +
            "                    \"contents\": [\n" +
            "                        {\n" +
            "                            \"id\": 1,\n" +
            "                            \"quantity\": 50,\n" +
            "                            \"ingredient\": {\n" +
            "                                \"id\": 3,\n" +
            "                                \"name\": \"водка\"\n" +
            "                            },\n" +
            "                            \"metricalValue\": {\n" +
            "                                \"id\": 2,\n" +
            "                                \"name\": \"миллилитр\",\n" +
            "                                \"shortName\": \"мл\"\n" +
            "                            },\n" +
            "                            \"contentInternalization\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"language\": {\n" +
            "                                    \"id\": 1,\n" +
            "                                    \"name\": \"Russian\",\n" +
            "                                    \"shortName\": \"RU_RU\"\n" +
            "                                }\n" +
            "                            }\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 4,\n" +
            "        \"numberDev\": 4,\n" +
            "        \"name\": \"Nexus 10\",\n" +
            "        \"orders\": []\n" +
            "    }\n" +
            "]";

    public static final String orders = "[\n" +
            "    {\n" +
            "        \"id\": 1,\n" +
            "        \"timestamp\": \"2014-07-21\",\n" +
            "        \"numberOrder\": 1,\n" +
            "        \"dishesMenu\": {\n" +
            "            \"id\": 1,\n" +
            "            \"cost\": 12.3,\n" +
            "            \"cookingTime\": 10,\n" +
            "            \"dishesInternalization\": {\n" +
            "                \"id\": 1,\n" +
            "                \"name\": \"Цезарь\",\n" +
            "                \"description\": \"вкусный салат\",\n" +
            "                \"language\": {\n" +
            "                    \"id\": 1,\n" +
            "                    \"name\": \"Russian\",\n" +
            "                    \"shortName\": \"RU_RU\"\n" +
            "                }\n" +
            "            },\n" +
            "            \"contents\": [\n" +
            "                {\n" +
            "                    \"id\": 4,\n" +
            "                    \"quantity\": 120,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 2,\n" +
            "                        \"name\": \"морковка\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"грамм\",\n" +
            "                        \"shortName\": \"гр\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 5,\n" +
            "                    \"quantity\": 120,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"name\": \"капуста\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"грамм\",\n" +
            "                        \"shortName\": \"гр\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 6,\n" +
            "                    \"quantity\": 90,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 4,\n" +
            "                        \"name\": \"лук\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"грамм\",\n" +
            "                        \"shortName\": \"гр\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 2,\n" +
            "        \"timestamp\": \"2014-07-21\",\n" +
            "        \"numberOrder\": 2,\n" +
            "        \"dishesMenu\": {\n" +
            "            \"id\": 2,\n" +
            "            \"cost\": 15.4,\n" +
            "            \"cookingTime\": 13,\n" +
            "            \"dishesInternalization\": {\n" +
            "                \"id\": 2,\n" +
            "                \"name\": \"Греческий\",\n" +
            "                \"description\": \"очень вкусный салат\",\n" +
            "                \"language\": {\n" +
            "                    \"id\": 1,\n" +
            "                    \"name\": \"Russian\",\n" +
            "                    \"shortName\": \"RU_RU\"\n" +
            "                }\n" +
            "            },\n" +
            "            \"contents\": [\n" +
            "                {\n" +
            "                    \"id\": 2,\n" +
            "                    \"quantity\": 100,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"name\": \"капуста\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"грамм\",\n" +
            "                        \"shortName\": \"гр\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                },\n" +
            "                {\n" +
            "                    \"id\": 3,\n" +
            "                    \"quantity\": 120,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 2,\n" +
            "                        \"name\": \"морковка\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"грамм\",\n" +
            "                        \"shortName\": \"гр\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": 3,\n" +
            "        \"timestamp\": \"2014-07-21\",\n" +
            "        \"numberOrder\": 3,\n" +
            "        \"dishesMenu\": {\n" +
            "            \"id\": 3,\n" +
            "            \"cost\": 50,\n" +
            "            \"cookingTime\": 1,\n" +
            "            \"dishesInternalization\": {\n" +
            "                \"id\": 3,\n" +
            "                \"name\": \"40 капель\",\n" +
            "                \"description\": \"просто огонь\",\n" +
            "                \"language\": {\n" +
            "                    \"id\": 1,\n" +
            "                    \"name\": \"Russian\",\n" +
            "                    \"shortName\": \"RU_RU\"\n" +
            "                }\n" +
            "            },\n" +
            "            \"contents\": [\n" +
            "                {\n" +
            "                    \"id\": 1,\n" +
            "                    \"quantity\": 50,\n" +
            "                    \"ingredient\": {\n" +
            "                        \"id\": 3,\n" +
            "                        \"name\": \"водка\"\n" +
            "                    },\n" +
            "                    \"metricalValue\": {\n" +
            "                        \"id\": 2,\n" +
            "                        \"name\": \"миллилитр\",\n" +
            "                        \"shortName\": \"мл\"\n" +
            "                    },\n" +
            "                    \"contentInternalization\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"language\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"Russian\",\n" +
            "                            \"shortName\": \"RU_RU\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    }\n" +
            "]";
}
